package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f11669b;

    public /* synthetic */ d(int i10, TaskCompletionSource taskCompletionSource) {
        this.f11668a = i10;
        this.f11669b = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Object lambda$callTask$2;
        Void lambda$race$0;
        Void lambda$race$1;
        int i10 = this.f11668a;
        TaskCompletionSource taskCompletionSource = this.f11669b;
        switch (i10) {
            case 0:
                lambda$callTask$2 = Utils.lambda$callTask$2(taskCompletionSource, task);
                return lambda$callTask$2;
            case 1:
                lambda$race$0 = Utils.lambda$race$0(taskCompletionSource, task);
                return lambda$race$0;
            default:
                lambda$race$1 = Utils.lambda$race$1(taskCompletionSource, task);
                return lambda$race$1;
        }
    }
}
