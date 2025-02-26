package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class zag<ResultT> extends zac {
    private final TaskApiCall<Api.AnyClient, ResultT> zaa;
    private final TaskCompletionSource<ResultT> zab;
    private final StatusExceptionMapper zad;

    public zag(int i10, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i10);
        this.zab = taskCompletionSource;
        this.zaa = taskApiCall;
        this.zad = statusExceptionMapper;
        if (i10 == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq<?> zabqVar) {
        return this.zaa.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final Feature[] zab(zabq<?> zabqVar) {
        return this.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.zab.trySetException(this.zad.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.zab.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.zaa.doExecute(zabqVar.zaf(), this.zab);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            zad(zai.zah(e11));
        } catch (RuntimeException e12) {
            this.zab.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaadVar, boolean z10) {
        zaadVar.zad(this.zab, z10);
    }
}
