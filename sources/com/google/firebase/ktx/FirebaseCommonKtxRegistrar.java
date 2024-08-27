package com.google.firebase.ktx;

import androidx.annotation.Keep;
import bq.a;
import bq.j;
import bq.p;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import qu.b0;
import rq.b;
import vt.y;
import wp.c;
import wp.d;
import yk.g;

@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", HttpUrl.FRAGMENT_ENCODE_SET, "Lbq/a;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<a> getComponents() {
        a p10 = g.p("fire-core-ktx", "20.3.2");
        p pVar = new p(wp.a.class, b0.class);
        p[] pVarArr = new p[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            if (pVar2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, pVarArr);
        j jVar = new j(new p(wp.a.class, Executor.class), 1, 0);
        if (!hashSet.contains(jVar.f7260a)) {
            hashSet2.add(jVar);
            a aVar = new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, b.f33974b, hashSet3);
            Intrinsics.checkNotNullExpressionValue(aVar, "builder(Qualified.qualif…cher()\n    }\n    .build()");
            p pVar3 = new p(c.class, b0.class);
            p[] pVarArr2 = new p[0];
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            hashSet4.add(pVar3);
            for (p pVar4 : pVarArr2) {
                if (pVar4 == null) {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(hashSet4, pVarArr2);
            j jVar2 = new j(new p(c.class, Executor.class), 1, 0);
            if (!hashSet4.contains(jVar2.f7260a)) {
                hashSet5.add(jVar2);
                a aVar2 = new a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, b.f33975c, hashSet6);
                Intrinsics.checkNotNullExpressionValue(aVar2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
                p pVar5 = new p(wp.b.class, b0.class);
                p[] pVarArr3 = new p[0];
                HashSet hashSet7 = new HashSet();
                HashSet hashSet8 = new HashSet();
                HashSet hashSet9 = new HashSet();
                hashSet7.add(pVar5);
                for (p pVar6 : pVarArr3) {
                    if (pVar6 == null) {
                        throw new NullPointerException("Null interface");
                    }
                }
                Collections.addAll(hashSet7, pVarArr3);
                j jVar3 = new j(new p(wp.b.class, Executor.class), 1, 0);
                if (!hashSet7.contains(jVar3.f7260a)) {
                    hashSet8.add(jVar3);
                    a aVar3 = new a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, b.f33976d, hashSet9);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
                    p pVar7 = new p(d.class, b0.class);
                    p[] pVarArr4 = new p[0];
                    HashSet hashSet10 = new HashSet();
                    HashSet hashSet11 = new HashSet();
                    HashSet hashSet12 = new HashSet();
                    hashSet10.add(pVar7);
                    for (p pVar8 : pVarArr4) {
                        if (pVar8 == null) {
                            throw new NullPointerException("Null interface");
                        }
                    }
                    Collections.addAll(hashSet10, pVarArr4);
                    j jVar4 = new j(new p(d.class, Executor.class), 1, 0);
                    if (!hashSet10.contains(jVar4.f7260a)) {
                        hashSet11.add(jVar4);
                        a aVar4 = new a(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, b.f33977e, hashSet12);
                        Intrinsics.checkNotNullExpressionValue(aVar4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
                        return y.g(p10, aVar, aVar2, aVar3, aVar4);
                    }
                    throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
                }
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
