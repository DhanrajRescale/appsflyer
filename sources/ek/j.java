package ek;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j implements yj.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15595a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15596b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15597c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15598d;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f15595a = i10;
        this.f15597c = obj;
        this.f15598d = obj2;
    }

    @Override // yj.e
    public final Class a() {
        int i10 = this.f15595a;
        Object obj = this.f15598d;
        switch (i10) {
            case 0:
                ((t9.c) obj).getClass();
                return InputStream.class;
            default:
                return ((k) obj).a();
        }
    }

    @Override // yj.e
    public final void c() {
        int i10 = this.f15595a;
        Object obj = this.f15598d;
        switch (i10) {
            case 0:
                try {
                    Object obj2 = this.f15596b;
                    ((t9.c) obj).getClass();
                    ((InputStream) obj2).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            default:
                Object obj3 = this.f15596b;
                if (obj3 != null) {
                    try {
                        ((k) obj).n(obj3);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // yj.e
    public final void cancel() {
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        int i10 = this.f15595a;
        Object obj = this.f15597c;
        Object obj2 = this.f15598d;
        switch (i10) {
            case 0:
                try {
                    ((t9.c) obj2).getClass();
                    ByteArrayInputStream r10 = t9.c.r((String) obj);
                    this.f15596b = r10;
                    dVar.j(r10);
                    return;
                } catch (IllegalArgumentException e10) {
                    dVar.e(e10);
                    return;
                }
            default:
                try {
                    Object g10 = ((k) obj2).g((File) obj);
                    this.f15596b = g10;
                    dVar.j(g10);
                    return;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e11);
                    }
                    dVar.e(e11);
                    return;
                }
        }
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }
}
