import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {NotificationsComponent} from "./notifications/notifications.component";
import { NotificationsRxComponent } from './notifications-rx/notifications-rx.component';

@NgModule({
  declarations: [
    AppComponent,
    NotificationsComponent,
    NotificationsRxComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
