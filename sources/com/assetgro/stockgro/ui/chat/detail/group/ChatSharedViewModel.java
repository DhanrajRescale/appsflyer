package com.assetgro.stockgro.ui.chat.detail.group;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.work.i0;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import kj.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pj.a;
import qj.i;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/detail/group/ChatSharedViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChatSharedViewModel extends BaseViewModel {
    public final e0 A;
    public final e0 B;
    public final e0 C;
    public final e0 D;
    public final e0 E;
    public final e0 F;
    public final e0 G;
    public final e0 H;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9133n;

    /* renamed from: o, reason: collision with root package name */
    public final e0 f9134o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f9135p;

    /* renamed from: q, reason: collision with root package name */
    public final e0 f9136q;

    /* renamed from: r, reason: collision with root package name */
    public final e0 f9137r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f9138s;

    /* renamed from: t, reason: collision with root package name */
    public final e0 f9139t;

    /* renamed from: u, reason: collision with root package name */
    public final e0 f9140u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f9141v;

    /* renamed from: w, reason: collision with root package name */
    public final e0 f9142w;

    /* renamed from: x, reason: collision with root package name */
    public final e0 f9143x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f9144y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f9145z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ChatSharedViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ChatRepository chatRepository, i0 workManager) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        this.f9134o = new LiveData();
        this.f9135p = new LiveData();
        this.f9136q = new LiveData();
        ?? liveData = new LiveData();
        this.f9137r = liveData;
        this.f9138s = liveData;
        this.f9139t = new LiveData();
        this.f9140u = new LiveData();
        this.f9141v = new LiveData();
        this.f9142w = new LiveData();
        this.f9143x = new LiveData();
        this.f9144y = new LiveData();
        this.f9145z = new LiveData();
        this.A = new LiveData();
        this.B = new LiveData();
        this.C = new LiveData();
        this.D = new LiveData();
        this.E = new LiveData();
        this.F = new LiveData();
        this.G = new LiveData();
        new LiveData();
        new LiveData();
        this.H = new LiveData();
    }

    public final void h(i option) {
        Intrinsics.checkNotNullParameter(option, "option");
        switch (option.ordinal()) {
            case 0:
                this.f9139t.postValue(new j(Unit.f23355a));
                return;
            case 1:
                this.f9140u.postValue(new j(Unit.f23355a));
                return;
            case 2:
                this.f9141v.postValue(new j(Unit.f23355a));
                return;
            case 3:
                this.f9142w.postValue(new j(Unit.f23355a));
                return;
            case 4:
                this.f9143x.postValue(new j(Unit.f23355a));
                return;
            case 5:
                this.f9144y.postValue(new j(Unit.f23355a));
                return;
            case 6:
                this.f9145z.postValue(new j(Unit.f23355a));
                return;
            case 7:
                this.A.postValue(new j(Unit.f23355a));
                return;
            case 8:
                this.B.postValue(new j(Unit.f23355a));
                return;
            case 9:
            default:
                return;
            case 10:
                this.G.postValue(new j(Unit.f23355a));
                return;
        }
    }

    public final void i(boolean z10) {
        this.f9137r.setValue(Boolean.valueOf(z10));
    }
}
