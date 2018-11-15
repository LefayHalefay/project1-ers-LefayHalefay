import React from 'react';
import { Link } from 'react-router-dom';

export class SignInEmployeeComponent extends React.Component{

   render(){
      return(
         <div className="backgroundForBody">
            <div className="container py-5">
               <div className="row">
                  <div className="backgroundForPages card mx-auto col-sm-6 mb-4">
                     <h1 className="text-center"> Employee Portal </h1>
                        <div className="mx-auto">
                           <div className="col-md-5"></div>
                              <div className="card rounded-0">
                              <div className="card-header">
                                 <h3 className="mb-0">Login</h3>
                              </div>
                                 <div className="card-body">
                                    <form className="form" autoComplete="off" id="formLogin" noValidate="" method="POST">
                                       <div className="form-group">
                                       <label htmlFor="uname1">Username</label>
                                       <input type="text" className="form-control form-control-lg rounded-0" name="uname1" id="uname1" required=""/>
                                          <div className="invalid-feedback">Oops, you missed this one.</div>
                                     </div>
                                       <div className="form-group">
                                          <label>Password</label>
                                          <input type="password" className="form-control form-control-lg rounded-0" id="pwd1" required="" autoComplete="new-password"/>
                                             <div className="invalid-feedback">Enter your password too!</div>
                                       </div>
                                       <div>
                                          <label className="custom-control custom-checkbox">
                                             <input type="checkbox" className="custom-control-input"/>
                                                <span className="custom-control-indicator"></span>
                                                <span className="custom-control-description small text-dark">Remember me on this computer</span>
                                          </label>
                                       </div>
                                       <button type="submit" className="btn btn-dark btn-lg float-right" id="btnLogin">Login</button>
                                    </form>
                              </div>
                        </div>
                        <div className="mb-5"> </div>
                     </div>
                  </div>
               </div>  
            </div>   
         </div>            
      );
   }
}

