package com.google.firebase.auth.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import vt.x;
import yk.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/auth/ktx/FirebaseAuthKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_auth_ktx_granule"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FirebaseAuthKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return x.a(g.p("fire-auth-ktx", "22.0.0"));
    }
}
