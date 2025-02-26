package com.google.firebase.remoteconfig.ktx;

import androidx.annotation.Keep;
import bq.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.ktx.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.x;
import yk.g;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/remoteconfig/ktx/FirebaseRemoteConfigKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", HttpUrl.FRAGMENT_ENCODE_SET, "Lbq/a;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-config-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FirebaseRemoteConfigKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<a> getComponents() {
        return x.a(g.p("fire-cfg-ktx", BuildConfig.VERSION_NAME));
    }
}
