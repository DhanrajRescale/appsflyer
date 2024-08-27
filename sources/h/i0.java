package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class i0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f17695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17696b;

    /* renamed from: c, reason: collision with root package name */
    public Method f17697c;

    /* renamed from: d, reason: collision with root package name */
    public Context f17698d;

    public i0(View view, String str) {
        this.f17695a = view;
        this.f17696b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f17697c == null) {
            View view2 = this.f17695a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f17696b;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.f17697c = method;
                            this.f17698d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder s7 = da.e.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    s7.append(view2.getClass());
                    s7.append(str);
                    throw new IllegalStateException(s7.toString());
                }
            }
        }
        try {
            this.f17697c.invoke(this.f17698d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException("Could not execute method for android:onClick", e11);
        }
    }
}
