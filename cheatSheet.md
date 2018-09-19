{
   version
}


{ 
  books {
    id
    title
    author
  }
}


{ 
	getBookById(id:1) {
	  id
	  title
	  author
	}
}



{
  persons {
  name
  }
}

{
  getPersonById(id:"qeii") {
    name
  }
}


{
  getPersonById(id:"qeii") {
    name
    relationships {
      from {
        name
      }
      to {
        name
      }
      relationship
    }
  }
}



{
  getPersonById(id:"qeii") {
    name
    relationships(type:"SPOUSE") {
      from {
        name
      }
      to {
        name
      }
      relationship
    }
  }
}

MUTATION:

mutation {
  createPerson(name:"Princess Anne") {
    id
    name
    relationships {
      relationship
    }
  }
}


Introspection

{
  __schema {
    types {
      name
    }
  }
}


{
  __type(name: "Relationship") {
    name
    fields {
      name
      type {
        name
        kind
        ofType {
          name
          kind
        }
      }
    }
  }
}