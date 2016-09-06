<%@include file="./shared/header.jsp"%>

<table border="1px">
        <form:form action="addtocart" modelAttribute="cart">
    
            <th>Pizza Name</th> <th>Price</th>  <th>Add to Cart</th>
            <tr><td>Muffuleta</td><td>$20</td><td><input type="hidden" name="name" value="Muffuleta">
            <input type="hidden" name="price" value="20"><input type="submit" value="Add to cart"></td>
        </tr>
        </form:form>
        <form:form action="addtocart" modelAttribute="cart">
            <tr><td>Veggie Delight</td><td>$12 40</td><td>
            <input type="hidden" name="name" value="Veggie Delight">
            <input type="hidden" name="price" value="40"><input type="submit" value="Add to cart"></td>
        </tr>  
        </form:form>
         <form:form action="addtocart" modelAttribute="cart">
            <tr><td>Margherita</td><td>$10</td><td>
            <input type="hidden" name="name" value="margherita">
            <input type="hidden" name="price" value="10"><input type="submit" value="Add to cart"></td>
            </tr>
            
        </form:form>
</table> 