package controllers

import javax.inject._
import shared.SharedMessages
import play.api.mvc._

class loginCreateAccount @Inject()(cc:ControllerComponents) extends AbstractController(cc) {
  
    def login = Action { implicit request =>
        Ok(views.html.loginCreateAccount())
    }
    def validateInfo = TODO

    def createAccount = TODO
}
