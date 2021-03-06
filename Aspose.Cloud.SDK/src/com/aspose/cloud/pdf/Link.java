/**
 * 
 */
package com.aspose.cloud.pdf;
import java.lang.String;
/**
 * @author Mudassir
 *
 */
/// <summary>
/// represents a single Pdf Link in document
/// </summary>

public class Link
{
    public Link() { }

    private LinkActionType ActionType;
    private String Action;
    private LinkHighlightingMode Highlighting;
    private Color Color;

    public LinkActionType getLinkActionType(){return ActionType;}
    public LinkHighlightingMode getLinkHighlightingMode(){return Highlighting;}
    public Color getColor(){return Color;}
    public String getAction(){return Action;}
    
    
}