package nv;

import okhttp3.Request;

/* loaded from: classes2.dex */
public interface h extends Cloneable {
    void cancel();

    /* renamed from: clone */
    h mo24clone();

    v0 execute();

    boolean isCanceled();

    Request request();

    void v(k kVar);
}
