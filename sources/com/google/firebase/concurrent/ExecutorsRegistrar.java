package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import b5.s0;
import bq.f;
import bq.l;
import bq.p;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import wp.a;
import wp.b;
import wp.c;
import wp.d;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final l f11661a = new l(new f(2));

    /* renamed from: b, reason: collision with root package name */
    public static final l f11662b = new l(new f(3));

    /* renamed from: c, reason: collision with root package name */
    public static final l f11663c = new l(new f(4));

    /* renamed from: d, reason: collision with root package name */
    public static final l f11664d = new l(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(a.class, ExecutorService.class), new p(a.class, Executor.class)};
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
        bq.a aVar = new bq.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s0(1), hashSet3);
        p pVar3 = new p(b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(b.class, ExecutorService.class), new p(b.class, Executor.class)};
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
        bq.a aVar2 = new bq.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new s0(2), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
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
        bq.a aVar3 = new bq.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new s0(3), hashSet9);
        p pVar7 = new p(d.class, Executor.class);
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
        return Arrays.asList(aVar, aVar2, aVar3, new bq.a(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new s0(4), hashSet12));
    }
}
