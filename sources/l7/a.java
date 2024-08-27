package l7;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final p7.c f24106a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24107b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24108c;

    /* renamed from: d, reason: collision with root package name */
    public final hr.c f24109d;

    /* renamed from: e, reason: collision with root package name */
    public final List f24110e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24111f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24112g;

    public a(Context context, String str, p7.c cVar, hr.c cVar2, ArrayList arrayList, boolean z10, int i10, Executor executor, Executor executor2, boolean z11, boolean z12) {
        this.f24106a = cVar;
        this.f24107b = context;
        this.f24108c = str;
        this.f24109d = cVar2;
        this.f24111f = z11;
        this.f24112g = z12;
    }

    public final boolean a(int i10, int i11) {
        if (i10 <= i11 || !this.f24112g) {
            return this.f24111f;
        }
        return false;
    }
}
