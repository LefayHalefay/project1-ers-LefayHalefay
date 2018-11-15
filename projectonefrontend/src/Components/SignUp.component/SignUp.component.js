import React from 'react';

export class SignUpComponent extends React.Component{
   render(){
      return(
         <div className="backgroundForBody"> 
            <div class="container py-5">
               <div class="row">
                   <div class="backgroundForPages mx-auto col-sm-5">
                    <div class="card">
                        <div class="card-header">
                            <h4 class="mb-0">Employee Information</h4>
                        </div>
                        <div class="card-body ">
                            <form class="form" autocomplete="off">
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">First name</label>
                                    <div class="col-lg-7">
                                        <input class="form-control" type="text" value=""/>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Last name</label>
                                    <div class="col-lg-7">
                                        <input class="form-control" type="text" value=""/>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Email</label>
                                    <div class="col-lg-7">
                                        <input class="form-control" type="email" value=""/>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Username</label>
                                    <div class="col-lg-7">
                                        <input class="form-control" type="text" value=""/>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Password</label>
                                    <div class="col-lg-7">
                                        <input class="form-control" type="password" value=""/>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label">Confirm</label>
                                    <div class="col-lg-7">
                                        <input class="form-control" type="password" value=""/>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <label class="col-lg-3 col-form-label form-control-label"></label>
                                    <div class="col-lg-3">
                                        <input type="reset" class="btn btn-danger" value="Back"/>
                                     </div>   
                                    <div class="col-lg-3">
                                        <input type="button" class="btn btn-dark" value="Save"/>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
               </div>
             </div>
          </div>
         </div>
      );
   }
}
