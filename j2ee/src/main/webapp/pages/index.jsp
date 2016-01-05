<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<body>
	<div>
		<div>
			<a href="xml">Парсинг XML</a>
		</div>
	</div>
	<h1>Welcome</h1>

	<h2>Solving the J2EE tasks you can find here:</h2>
	J2EE
	<ul>
		<li>Enums for HTTP codes</li>

		<li><a href="login" >Demonstrate cookies usage.</a></li>
		<li>Demonstrate url rewriting</li>
		<li>Minimal WEB-APP</li>
		<li>Precompile jsp</li>
		<li>Inner tag construction jsp</li>
		<li>Demonstrate usage of jsp:useBean</li>
		<li>Verify if it`s possible to create few instance of servlet.</li>
		<li>ServletRequest, ServletContext dispatchers. Demonstrate usage
			of relative and absolute paths.</li>
		<li>sendRedirect and forward. Call the same logic with
			sendRedirect and forward. Explain difference. Check the response
			codes.</li>
		<li>Redirect filter.</li>
		<li>Practical usage of jsp implicit objects. Demonstrate usage of
			each of nine.</li>
		<li>Testing of filters chain in case of forwarding from one
			servlet to another (both servlets has their own two filters)</li>
		<li>Verify if it`s possible to mapping few servlets on one url.</li>
		<li>What order invoke servlets if they have the same
			load-on-startup.</li>
	</ul>
	
	Additional
	<ul>		
		<li>Iterate over enum elements</li>
		<li>Implement example of simple RMI call</li>
		<li>Implement example of ORM(include caching, lazy loading,
			different relationships of entities(OneToOne,ManyToOne,ManyToMany))</li>
		<li>ORM: link one bean to serveral tables</li>
		<li>ORM: map several beans to one table</li>
		<li>Implement Spring MVC simple app(PathParameter,
			RequestMappings, Static Resources Mapping, Spirng Encoding filter)</li>
		<li>Spring DI example</li>
		<li>Simple SOAP WS example</li>
		<li>REST WS based on spirng mvc</li>
		<li>Simple RPC call</li>
	</ul>
	<div>Mentor questions: 1) Можно ли в Post запрос передать
		параметры в строке запроса. Как это сделать 2) Эмитировать stateful
		состояние 3) Custom methods 4) уровень заголовков (технология которая
		использует Header, сруктура body) 5) распараллеливание чтения 6)
		версии HTTP 7) SOAP и REST как используют HTTP протокол и в чем
		разница 8) custom headers 9) зачем заголовок HOST и что будет, если не
		указать 10) как сделать custom method</div>
</body>
</html>