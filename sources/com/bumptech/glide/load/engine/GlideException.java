package com.bumptech.glide.load.engine;

import ak.a0;
import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import xj.a;
import xj.g;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: f, reason: collision with root package name */
    public static final StackTraceElement[] f10832f = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public final List f10833a;

    /* renamed from: b, reason: collision with root package name */
    public g f10834b;

    /* renamed from: c, reason: collision with root package name */
    public a f10835c;

    /* renamed from: d, reason: collision with root package name */
    public Class f10836d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10837e;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof GlideException) {
            Iterator it = ((GlideException) th2).f10833a.iterator();
            while (it.hasNext()) {
                a((Throwable) it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th2);
    }

    public static void b(List list, a0 a0Var) {
        try {
            c(list, a0Var);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a0 a0Var) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            a0Var.append("Cause (");
            int i11 = i10 + 1;
            a0Var.append(String.valueOf(i11));
            a0Var.append(" of ");
            a0Var.append(String.valueOf(size));
            a0Var.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).f(a0Var);
            } else {
                d(th2, a0Var);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void f(Appendable appendable) {
        d(this, appendable);
        b(this.f10833a, new a0(appendable));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f10837e);
        Class cls = this.f10836d;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (cls != null) {
            str = ", " + this.f10836d;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str);
        if (this.f10835c != null) {
            str2 = ", " + this.f10835c;
        } else {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb2.append(str2);
        if (this.f10834b != null) {
            str3 = ", " + this.f10834b;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        f(System.err);
    }

    public GlideException(String str, List list) {
        this.f10837e = str;
        setStackTrace(f10832f);
        this.f10833a = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        f(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        f(printWriter);
    }
}
