package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.f0;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static b f12529a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12530b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12531c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (b.f12529a == null) {
                b unused = b.f12529a = new b(context, null);
            }
            return b.f12529a;
        }
    }

    private b(Context context) {
        this.f12531c = null;
        this.f12531c = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        return null;
    }

    public /* synthetic */ b(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        if (j0Var.equals(j0.f12611o) && a(obj)) {
            new y(this.f12531c).c(b(j0Var, obj));
        }
    }

    public boolean a(Object obj) {
        return true;
    }
}
