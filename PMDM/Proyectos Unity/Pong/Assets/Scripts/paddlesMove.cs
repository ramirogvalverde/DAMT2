using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class paddlesMove : MonoBehaviour
{


    [SerializeField]
    private float speed = 4f;
    [SerializeField]
    private bool paddleid = false;

    private float yLimit = 3.34f;


    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {

        float movement;

        if(paddleid)
        {
            movement = Input.GetAxisRaw("Vertical");
        }
        else
        {
            movement = Input.GetAxisRaw("Vertical2");
        }

        //transform.position += new Vector3(0f, movement * speed * Time.deltaTime, 0f);

        Vector2 paddlePostition = transform.position;
        paddlePostition.y = Mathf.Clamp(paddlePostition.y + movement * speed *Time.deltaTime, -yLimit,yLimit);
        transform.position = paddlePostition;

        
    }
}
