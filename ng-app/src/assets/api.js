jQuery(function ($) {

  let stompClient;

  $("#js-connect").click(function () {
    if (!stompClient) {
      const socket = new SockJS("http://localhost:8080/notifications");
      stompClient = Stomp.over(socket);
      stompClient.connect({}, function () {

        stompClient.subscribe('/user/notification/item', function (response) {
          console.log('Got ' + response);
          $("#js-notifications").append(JSON.parse(response.body).text + ' ')
        });

        console.info('connected!')
      });
    }
  });

  $('#js-disconnect').click(function () {
    if (stompClient) {
      stompClient.disconnect();
      stompClient = null;
      console.info("disconnected :-/");
    }
  });

  $("#js-start").click(function () {
    if (stompClient) {
      stompClient.send("/swns/start", {});
    }
  });

  $("#js-stop").click(function () {
    if (stompClient) {
      stompClient.send("/swns/stop", {});
    }
  });
});
