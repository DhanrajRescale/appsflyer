package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f12243a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12244b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12245c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (b.f12243a == null) {
                b unused = b.f12243a = new b(context, null);
            }
            return b.f12243a;
        }
    }

    private b(Context context) {
        this.f12245c = null;
        this.f12245c = context.getApplicationContext();
    }

    public /* synthetic */ b(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        new com.webengage.sdk.android.actions.database.a(this.f12245c).c((Map<String, Object>) null);
    }
}
