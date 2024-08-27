package ov;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import nv.o;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import os.h;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final MediaType f30428c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    public static final Charset f30429d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Gson f30430a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter f30431b;

    public b(Gson gson, TypeAdapter typeAdapter) {
        this.f30430a = gson;
        this.f30431b = typeAdapter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, bv.j] */
    @Override // nv.o
    public final Object e(Object obj) {
        ?? obj2 = new Object();
        JsonWriter newJsonWriter = this.f30430a.newJsonWriter(new OutputStreamWriter(new h(obj2, 1), f30429d));
        this.f30431b.write(newJsonWriter, obj);
        newJsonWriter.close();
        return RequestBody.create(f30428c, obj2.e(obj2.f7365b));
    }
}
