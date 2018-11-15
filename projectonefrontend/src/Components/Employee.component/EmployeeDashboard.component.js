import React from 'react';


export class EmployeeDashboardComponent extends React.Component {
   
   render(){
      return(
         <div className="col-sm-12 mx-auto">
            <div className="flex-row-sb mt-2 mb-2">
               <div> <h1>Employee Dashboard</h1> </div>
               <div><button id = "add-request-btn" type="button" className="btn btn-dark"> Add Request</button></div>
               <div>
                   <div><button id = "employee-signout-btn" type="button" className="btn-sm btn-danger"> Sign Out</button></div>
               </div>
            </div>
            <table className="col-sm-10 mx-auto table table-bordered">
               <thead class="thead-dark table-hover table-striped">
                  <tr>
                     <th scope="col">#</th>
                     <th scope="col">Date Requested </th>
                     <th scope="col">Type </th>
                     <th scope="col">Amount </th>
                     <th scope="col"> Status </th>
                     <th scope="col"> Date Resolved </th>
                     <th scope="col"> Resolver </th>
                     <th scope="col"> Reason </th>
                     
                  </tr>
               </thead>
               <tbody className=" table-striped">
                  <tr className="table-warning">
                     <th scope="row">1</th>
                     <td>Mark</td>
                     <td>Otto</td>
                     <td>@mdo</td>
                  </tr>
                  <tr>
                     <th scope="row">2</th>
                     <td>Jacob</td>
                     <td>Thornton</td>
                     <td>@fat</td>
                  </tr>
                  <tr className="table-warning">
                     <th scope="row">3</th>
                     <td>Larry</td>
                     <td>the Bird</td>
                     <td>@twitter</td>
                  </tr>
                  <tr>
                     <th scope="row">1</th>
                     <td>Mark</td>
                     <td>Otto</td>
                     <td>@mdo</td>
                  </tr>
                  <tr className="table-warning">
                     <th scope="row">2</th>
                     <td>Jacob</td>
                     <td>Thornton</td>
                     <td>@fat</td>
                  </tr>
                  <tr>
                     <th scope="row">3</th>
                     <td>Larry</td>
                     <td>the Bird</td>
                     <td>@twitter</td>
                  </tr>
                  <tr className="table-warning">
                     <th scope="row">1</th>
                     <td>Mark</td>
                     <td>Otto</td>
                     <td>@mdo</td>
                  </tr>
                  <tr>
                     <th scope="row">2</th>
                     <td>Jacob</td>
                     <td>Thornton</td>
                     <td>@fat</td>
                  </tr>
                  <tr className="table-warning">
                     <th scope="row">3</th>
                     <td>Larry</td>
                     <td>the Bird</td>
                     <td>@twitter</td>
                  </tr>
               </tbody>
            </table>
            <div className="mb-5"> </div>
         </div>
      );

   }
}