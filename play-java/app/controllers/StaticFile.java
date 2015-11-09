package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class StaticFile extends Controller {
    
    public Result show(String page) {
        return redirect(page);
    }
}