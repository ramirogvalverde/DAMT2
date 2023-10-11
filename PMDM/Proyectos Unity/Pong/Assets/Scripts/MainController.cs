using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class MainController : MonoBehaviour
{
  public void actionButtonPlay()
    {
        SceneManager.LoadScene("JuegoPrincipal");
    }

    public void actionButtonBack()
    {
        SceneManager.LoadScene("Menu");

    }
    public void actionButtonControls()
    {
        SceneManager.LoadScene("Controls");

    }

    public void quit()
    {
        Debug.Log("saliendo");
        Application.Quit();
    }


}
