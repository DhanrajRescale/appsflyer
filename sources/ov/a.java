package ov;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import nv.n;
import nv.o;
import nv.x0;
import wn.e;

/* loaded from: classes2.dex */
public final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f30427a;

    public a(Gson gson) {
        this.f30427a = gson;
    }

    @Override // nv.n
    public final o a(Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f30427a;
        return new b(gson, gson.getAdapter(typeToken));
    }

    @Override // nv.n
    public final o b(Type type, Annotation[] annotationArr, x0 x0Var) {
        TypeToken<?> typeToken = TypeToken.get(type);
        Gson gson = this.f30427a;
        return new e(gson, gson.getAdapter(typeToken), 22);
    }
}
