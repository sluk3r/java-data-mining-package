/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jdmp.core.script.jdmp.node;

import java.util.*;
import org.jdmp.core.script.jdmp.analysis.*;

@SuppressWarnings("nls")
public final class AColumn extends PColumn
{
    private PExpression _expression_;
    private final LinkedList<PSemicolonValue> _additionalValues_ = new LinkedList<PSemicolonValue>();

    public AColumn()
    {
        // Constructor
    }

    public AColumn(
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") List<PSemicolonValue> _additionalValues_)
    {
        // Constructor
        setExpression(_expression_);

        setAdditionalValues(_additionalValues_);

    }

    @Override
    public Object clone()
    {
        return new AColumn(
            cloneNode(this._expression_),
            cloneList(this._additionalValues_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAColumn(this);
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public LinkedList<PSemicolonValue> getAdditionalValues()
    {
        return this._additionalValues_;
    }

    public void setAdditionalValues(List<PSemicolonValue> list)
    {
        this._additionalValues_.clear();
        this._additionalValues_.addAll(list);
        for(PSemicolonValue e : list)
        {
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression_)
            + toString(this._additionalValues_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._additionalValues_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        for(ListIterator<PSemicolonValue> i = this._additionalValues_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSemicolonValue) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
