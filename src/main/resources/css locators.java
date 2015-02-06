1 - element selector
	css=htmltag
	First element with given html tag
2- id as a selector
	css=#idvalue
3 - class as a selector
	css=.classname
4 - combining selector class or id
	css=htmltag.classname
	css=htmltag#id
5 - by property and its value
	css=[property='value']
	"option[value='DC']"
	
6 - combining selectors - other hattributes
	css=htmltag[property='value']
	css=htmltag[property='value'][property='value']
7 - Descendant  selector
	css=htmltag htmltag
8 - Child selector
	css=htmltag > htmltag
9 - by text
	htmltag : contains:("full or partial text // not working
	css=div[@title~=title] //not working
10 - immediate next element
	css=htmltag+next htmltag
	css=css path+next htmltag/css path
11 - by nth-of-type
	htmltag descendant htmltag:nth-of-type(n)
12 - substring matches
	^= match a prefix
	$= match a suffix
	*= match a substring
	htmltag[id^='prefix']
	htmltag[id$="suffix"]
	htmltag[id*='substring']
