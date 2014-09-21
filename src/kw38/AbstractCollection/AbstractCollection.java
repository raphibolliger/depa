package kw38.AbstractCollection;

import java.util.Collection;
import java.util.Iterator;

public abstract class AbstractCollection<E> implements Collection<E> {

    @Override
    public int size()
    {
        int count = 0;
        while (iterator().hasNext())
        {
            iterator().next();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty()
    {
        return !iterator().hasNext();
    }

    @Override
    public boolean contains(Object o)
    {
        while (iterator().hasNext())
        {
            Object same = iterator().hasNext();
            if (same.equals(o)) return true;
        }
        return false;
    }

    @Override
    public Iterator<E> iterator()
    {
        return null;
    }

    @Override
    public Object[] toArray()
    {
        Object[] a = new Object[size()];
        for (int i = 0; i < size(); i++)
        {
            a[i] = iterator().hasNext();
        }
        return a;
    }

    @Override
    public <T> T[] toArray(T[] a) // ist das gegebene gleich lang?
    {
        for (int i = 0; i < size(); i++)
        {
            a[i] = (T)iterator().next();
        }
        return a;
    }

    @Override
    public boolean add(E e)
    {
        return false;
    }

    @Override
    public boolean remove(Object o)
    {
        while (iterator().hasNext())
        {
            if (iterator().next().equals(o))
            {
                iterator().remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c)
    {
        return false;
    }

    @Override
    public void clear()
    {

    }
}
