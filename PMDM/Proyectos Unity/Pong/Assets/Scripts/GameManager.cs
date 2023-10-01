using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    // Start is called before the first frame update



    private int score1 = 0, score2 = 0;

    [SerializeField]
    private TMP_Text scoreA, scoreB;

    [SerializeField]
    private GameObject ball;

    public static GameManager Instance;

  

    private void Awake()

    {

        // Comprueba si la instancia ya existe

        if (Instance == null)

        {

        // Si no, establece la instancia a esta

        Instance = this;

        }

        // Si la instancia ya existe y no es esta:

        else if (Instance != this)

        {

            // Entonces destruye este objeto. Esto refuerza nuestro patrón Singleton, lo que significa que solo puede haber una instancia de un GameManager.

            Destroy(gameObject);

        }

        // Establece este para no ser destruido cuando se recargue la escena

        DontDestroyOnLoad(gameObject);

    }


    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        
    }

    IEnumerator waitOneSec()
    {
        ball.GetComponent<Transform>().SetPositionAndRotation(new Vector3(0, 0, 0), transform.rotation);
        ball.GetComponent<Rigidbody2D>().velocity = Vector3.zero;
        yield return new WaitForSeconds(1);
        ball.GetComponent<ballMovement>().launch();
    }

    public void scoredGoalA()
    {
        score1 += 1;
        scoreB.SetText(score1.ToString());
        StartCoroutine(waitOneSec());



    }



    public void scoredGoalB()
    {
        score2 += 1;
        scoreA.SetText(score2.ToString());
        StartCoroutine(waitOneSec());
    }
}
