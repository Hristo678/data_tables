$(document).ready(function () {
    var table = $('#table_id').DataTable();

    let result = {users: []}

    $('#table_id tbody').on('click', 'tr', function () {
        $(this).toggleClass('selected');

        // console.log($(this))
        // list.push($(this))
    });

    $('#saveBtn').on('click', event => {

        let rows = $('.selected')
        console.log(rows)
        let names = []
        $.each(rows, function(index, value){

            let name = value.children.item(0).innerHTML
            let age = value.children.item(1).innerHTML
            let email = value.children.item(2).innerHTML
            result.users.push({name, age, email})
            names.push(name);
        });

        $.confirm({
            title: 'Are you sure you want to save this data?',
            content: names.join('\r\n'),
            buttons: {
                confirm: function () {

                    $.ajax({
                        type: "POST",
                        url: window.location + "/add",
                        contentType: "application/json",
                        data: JSON.stringify(result),
                        dataType: '"json"',
                        success : function (result){
                            if(result.status === "success"){
                                console.log("success")
                            }
                        }

                    })
                },
                cancel: function () {
                    $.alert('Canceled!');
                },
                somethingElse: {
                    text: 'Something else',
                    btnClass: 'btn-blue',
                    keys: ['enter', 'shift'],
                    action: function(){
                        $.alert('Something else?');
                    }
                }
            }
        });


        // $.ajax({
        //     type: "POST",
        //     url: window.location + "/add",
        //     contentType: "application/json",
        //     data: JSON.stringify(result),
        //     dataType: '"json"',
        //     success : function (result){
        //         if(result.status === "success"){
        //             console.log("success")
        //         }
        //     }
        //
        // })
        // location.reload()
    });

    $('#table_id tbody tr').on('click', (event=>{
        let element = event.target.parentNode


        let name = element.children.item(0).innerHTML
        let age = element.children.item(1).innerHTML
        let email = element.children.item(2).innerHTML

        // $.ajax({
        //     type: "POST",
        //     url: window.location + "/add",
        //     contentType: "application/json",
        //     data: JSON.stringify({name, age, email}),
        //     dataType: '"json"',
        //     success : function (result){
        //         if(result.status === "success"){
        //             console.log("success")
        //         }
        //     }
        //
        // })

        // $.ajax('http://localhost:8080/users',{
        //         type: "POST",
        //         url: window.location + "/add",
        //         contentType: "application/json",
        //         data: JSON.stringify({name, age, email}),
        //         dataType: "json"
        //     }
        //     )
    }))

    $('#button').click(function () {
        alert(table.rows('.selected').data().length + ' row(s) selected');
    });
});