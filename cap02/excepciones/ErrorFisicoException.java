/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.excepciones;
@SuppressWarnings("serial")
/**
 *
 * @author eduar
 */
public class ErrorFisicoException extends Exception
{
    public ErrorFisicoException(Exception ex)
    {
        super("Ocurrio un Error Fisico", ex);
    }
}
