package com.assetgro.stockgro.data;

import com.assetgro.stockgro.data.remote.response.HomePageTopDataResponse;
import com.assetgro.stockgro.data.remote.response.StocksListResponse;
import com.assetgro.stockgro.data.repository.ContactsRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import et.c;
import et.d;
import et.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements c, d, e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8562a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8563b;

    public /* synthetic */ a(int i10, Function1 function1) {
        this.f8562a = i10;
        this.f8563b = function1;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        int i10 = this.f8562a;
        Function1 function1 = this.f8563b;
        switch (i10) {
            case 2:
                return ContactsWorker.b(function1, obj);
            case 3:
                return ContactsWorker.a(function1, obj);
            case 4:
                return ContactsRepository.b(function1, obj);
            case 15:
                return (StocksListResponse) a3.a.c(function1, "$tmp0", obj, "p0", obj);
            case 21:
                return (HomePageTopDataResponse) a3.a.c(function1, "$tmp0", obj, "p0", obj);
            default:
                return (StocksListResponse) a3.a.c(function1, "$tmp0", obj, "p0", obj);
        }
    }

    @Override // et.c
    public final void b(Object obj) {
        int i10 = this.f8562a;
        Function1 tmp0 = this.f8563b;
        switch (i10) {
            case 0:
                ContactsUploadForegroundWorker.b(tmp0, obj);
                return;
            case 1:
                ContactsUploadForegroundWorker.a(tmp0, obj);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 15:
            case 21:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 6:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 7:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 8:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 9:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 11:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 12:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 13:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 14:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 16:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 17:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 18:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 19:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 20:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 22:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 23:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 25:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 26:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 27:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 28:
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
        }
    }

    @Override // et.e
    public final boolean d(Object obj) {
        boolean logout$lambda$10;
        logout$lambda$10 = UserRepository.logout$lambda$10(this.f8563b, obj);
        return logout$lambda$10;
    }
}
