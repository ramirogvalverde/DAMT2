using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ballMovement : MonoBehaviour
{

    [SerializeField]
    private float speed = 4f;
    [SerializeField]
    private Rigidbody2D ballBody;

    // Start is called before the first frame update
    void Start()
    {
        ballBody = GetComponent<Rigidbody2D>();
        launch();
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    public void launch()
    {
        float xSpeed;
        float ySpeed;

        if(Random.Range(0,2)==0)
        {
            xSpeed = 1;
        }
        else
        {
            xSpeed = -1;
        }

        if (Random.Range(0, 2) == 0)
        {
            ySpeed = 1;
        }
        else
        {
            ySpeed = -1;
        }

        ballBody.velocity = new Vector2(xSpeed, ySpeed) * speed;

    }

    //Triggers

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if(collision.gameObject.tag=="leftgoal")
        {

        }
        else if (collision.gameObject.tag == "rightgoal")
        {

        }

    }
    


}
