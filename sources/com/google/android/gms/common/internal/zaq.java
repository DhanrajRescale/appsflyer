package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zaq implements PendingResultUtil.ResultConverter {
    final /* synthetic */ Response zaa;

    public zaq(Response response) {
        this.zaa = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ Object convert(Result result) {
        this.zaa.setResult(result);
        return this.zaa;
    }
}
