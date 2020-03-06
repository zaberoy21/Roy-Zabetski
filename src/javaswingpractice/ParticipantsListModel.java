/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingpractice;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author zaberoy21
 */
class ParticipantsListModel<E> extends AbstractListModel<E>
{
    protected ArrayList<E> list;
    
    public ParticipantsListModel(ArrayList<E> list)
    {
        this.list = list;
    }
    public void addElement(E element) {
        list.add(element);
        int index = list.size();
        fireContentsChanged(element, index, index);
    }
    
    public void fireDataChanged() {
        int index = list.size();
        if (index > 0){
            fireContentsChanged(list.get(index - 1), index, index);
        } else {
            fireContentsChanged(this, 0, 0);
        }
    }
    
    @Override
    public int getSize()
    {
        return list.size();
    }

    @Override
    public E getElementAt(int index)
    {
        return list.get(index);
    }
}
