package controllers

import javax.inject._

import jp.t2v.lab.play2.auth.OptionalAuthElement
import play.api.data.Form
import play.api.data.Forms.{ optional, text }
import play.api.i18n.{ I18nSupport, MessagesApi }
import play.api.mvc._
import services.UserService

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject()(val userService: UserService, val messagesApi: MessagesApi)
    extends Controller
    with AuthConfigSupport
    with OptionalAuthElement
    with I18nSupport {

  def index = StackAction { implicit request =>
    Ok(views.html.index(loggedIn))
  }

}
