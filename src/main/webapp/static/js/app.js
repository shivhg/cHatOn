App = Ember.Application.create();

App.Router.map(function() {
	    this.route('songs', { path: ':slug' });
}); 


App.IndexRoute = Ember.Route.extend({
  model: function() {
    return ['red', 'yellow', 'blue'];
  }
});


App.IndexController = Ember.Controller.extend({
	
})