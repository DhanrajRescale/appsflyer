package aq;

import android.content.Context;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import h.r0;

/* loaded from: classes2.dex */
public final class i implements OnFailureListener, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f2731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f2732c;

    public /* synthetic */ i(TaskCompletionSource taskCompletionSource, Context context, int i10) {
        this.f2730a = i10;
        this.f2731b = taskCompletionSource;
        this.f2732c = context;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i10 = this.f2730a;
        Context context = this.f2732c;
        TaskCompletionSource taskCompletionSource = this.f2731b;
        switch (i10) {
            case 0:
                taskCompletionSource.setException(exc);
                r0.i(context);
                return;
            case 1:
            default:
                taskCompletionSource.setException(exc);
                r0.i(context);
                return;
            case 2:
                taskCompletionSource.setException(exc);
                r0.i(context);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i10 = this.f2730a;
        Context context = this.f2732c;
        TaskCompletionSource taskCompletionSource = this.f2731b;
        switch (i10) {
            case 1:
                taskCompletionSource.setResult((zp.e) obj);
                r0.i(context);
                return;
            case 2:
            default:
                taskCompletionSource.setResult((zp.e) obj);
                r0.i(context);
                return;
            case 3:
                taskCompletionSource.setResult((zp.e) obj);
                r0.i(context);
                return;
        }
    }
}
