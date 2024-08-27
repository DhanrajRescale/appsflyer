package com.assetgro.stockgro.ui.profile.report;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u0;
import com.assetgro.stockgro.data.remote.response.ReportEntityType;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.repository.FeedRepository;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.ui.base.BaseViewModel;
import hh.f;
import hh.j;
import hh.k;
import java.util.ArrayList;
import java.util.List;
import jt.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import nt.h;
import okhttp3.HttpUrl;
import pj.a;
import t0.n1;
import t0.o3;
import t0.t;
import vt.i0;
import yk.g;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/ui/profile/report/ReportEntityViewModel;", "Lcom/assetgro/stockgro/ui/base/BaseViewModel;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ReportEntityViewModel extends BaseViewModel {

    /* renamed from: n, reason: collision with root package name */
    public final ChatRepository f10010n;

    /* renamed from: o, reason: collision with root package name */
    public final FeedRepository f10011o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f10012p;

    /* renamed from: q, reason: collision with root package name */
    public String f10013q;

    /* renamed from: r, reason: collision with root package name */
    public String f10014r;

    /* renamed from: s, reason: collision with root package name */
    public String f10015s;

    /* renamed from: t, reason: collision with root package name */
    public ReportEntityType f10016t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10017u;

    /* renamed from: v, reason: collision with root package name */
    public final e0 f10018v;

    /* renamed from: w, reason: collision with root package name */
    public List f10019w;

    /* renamed from: x, reason: collision with root package name */
    public final n1 f10020x;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f10021y;

    /* renamed from: z, reason: collision with root package name */
    public final e0 f10022z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public ReportEntityViewModel(a schedulerProvider, ct.a compositeDisposable, UserRepository userRepository, ChatRepository chatRepository, FeedRepository feedRepository) {
        super(schedulerProvider, compositeDisposable, userRepository);
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(feedRepository, "feedRepository");
        this.f10010n = chatRepository;
        this.f10011o = feedRepository;
        this.f10012p = new LiveData();
        this.f10013q = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f10014r = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f10016t = ReportEntityType.User;
        this.f10018v = new LiveData();
        new ArrayList();
        new ArrayList();
        this.f10020x = t.n0(i0.f38321a, o3.f35116a);
        this.f10021y = new LiveData();
        this.f10022z = new LiveData();
    }

    public static void h(ReportEntityViewModel reportEntityViewModel, String code, String str, String str2, int i10) {
        String subCode;
        String otherReason;
        int i11;
        if ((i10 & 2) != 0) {
            subCode = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            subCode = str;
        }
        if ((i10 & 4) != 0) {
            otherReason = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            otherReason = str2;
        }
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(subCode, "subCode");
        Intrinsics.checkNotNullParameter(otherReason, "otherReason");
        ReportEntityType reportEntityType = reportEntityViewModel.f10016t;
        if (reportEntityType == null) {
            i11 = -1;
        } else {
            i11 = f.f18466a[reportEntityType.ordinal()];
        }
        e0 e0Var = reportEntityViewModel.f9084g;
        ct.a aVar = reportEntityViewModel.f9080c;
        a aVar2 = reportEntityViewModel.f9079b;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        g.H(u0.f(reportEntityViewModel), null, null, new j(reportEntityViewModel, code, HttpUrl.FRAGMENT_ENCODE_SET, null), 3);
                        return;
                    }
                    return;
                }
                String str3 = reportEntityViewModel.f10015s;
                if (str3 != null) {
                    e0Var.postValue(Boolean.TRUE);
                    h c10 = reportEntityViewModel.f10010n.reportUserChatMessageV2(str3, code, subCode, HttpUrl.FRAGMENT_ENCODE_SET).c(((e) aVar2).J());
                    d dVar = new d(new vg.d(21, new hh.g(reportEntityViewModel, 7)), new vg.d(22, new hh.g(reportEntityViewModel, 8)));
                    c10.a(dVar);
                    aVar.c(dVar);
                    return;
                }
                return;
            }
            g.H(u0.f(reportEntityViewModel), null, null, new k(reportEntityViewModel, code, otherReason, null), 3);
            return;
        }
        String str4 = reportEntityViewModel.f10014r;
        e0Var.postValue(Boolean.TRUE);
        h c11 = reportEntityViewModel.f10010n.reportUser(true, str4, code, subCode, otherReason).c(((e) aVar2).J());
        d dVar2 = new d(new vg.d(17, new hh.g(reportEntityViewModel, 5)), new vg.d(18, new hh.g(reportEntityViewModel, 6)));
        c11.a(dVar2);
        aVar.c(dVar2);
    }

    public final void i(List list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f10020x.setValue(list);
    }
}
