package com.assetgro.stockgro.ui.chat.helper.search;

import a3.a;
import android.content.Context;
import android.net.Uri;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.t;
import at.m;
import com.assetgro.stockgro.data.remote.response.AssetUploadResponse;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import fv.e;
import fv.g;
import iu.z;
import java.io.File;
import java.util.Map;
import jt.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import t0.d2;
import ub.f;
import vl.b;
import vt.o0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/assetgro/stockgro/ui/chat/helper/search/AssetUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lcom/assetgro/stockgro/data/repository/ChatRepository;", "chatRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/assetgro/stockgro/data/repository/ChatRepository;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AssetUploadWorker extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public final Context f9346b;

    /* renamed from: c, reason: collision with root package name */
    public final ChatRepository f9347c;

    /* renamed from: d, reason: collision with root package name */
    public e f9348d;

    /* renamed from: e, reason: collision with root package name */
    public String f9349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUploadWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams, @NotNull ChatRepository chatRepository) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        this.f9346b = appContext;
        this.f9347c = chatRepository;
    }

    public static final void b(AssetUploadWorker assetUploadWorker, Map map) {
        g b10;
        String str = assetUploadWorker.f9349e;
        if (str != null) {
            assetUploadWorker.f9348d = le.g.f24613a.a("groupchat:".concat(str), o0.b(new Pair("token", a.f("Bearer ", assetUploadWorker.f9347c.getAccessToken()))));
        }
        e eVar = assetUploadWorker.f9348d;
        if (eVar != null) {
            if (eVar.a()) {
                assetUploadWorker.c(map);
                return;
            }
            e eVar2 = assetUploadWorker.f9348d;
            if (eVar2 != null && (b10 = e.b(eVar2)) != null) {
                b10.a("ok", new zd.g(2, assetUploadWorker, map));
                b10.a("error", ge.a.f17296d);
            }
        }
    }

    @Override // androidx.work.Worker
    public final t a() {
        String str;
        z zVar = new z();
        String b10 = getInputData().b("uri");
        this.f9349e = getInputData().b("group_id");
        String b11 = getInputData().b("message_type");
        String valueOf = String.valueOf(getInputData().b("message_id"));
        String b12 = getInputData().b("sender_id");
        String b13 = getInputData().b("sender_name");
        getInputData().b("replied_to");
        String b14 = getInputData().b("token");
        Uri parse = Uri.parse(b10);
        Intrinsics.c(parse);
        Context context = this.f9346b;
        File file = new File(b.z(context, parse));
        try {
            str = context.getContentResolver().getType(parse);
            if (str == null) {
                str = "image/jpeg";
            }
        } catch (Exception e10) {
            FirebaseCrashlytics.getInstance().recordException(e10);
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        m<AssetUploadResponse> uploadChatAssets = this.f9347c.uploadChatAssets(this.f9349e, valueOf, file, str);
        vd.a aVar = new vd.a(20, new d2(valueOf, b11, file, b12, b13, this, b14, zVar));
        vd.a aVar2 = new vd.a(21, new x1.m(4, zVar));
        uploadChatAssets.getClass();
        uploadChatAssets.a(new d(aVar, aVar2));
        Object obj = zVar.f20560a;
        Intrinsics.c(obj);
        return (t) obj;
    }

    public final void c(Map map) {
        e eVar = this.f9348d;
        if (eVar != null && !eVar.a()) {
            return;
        }
        try {
            e eVar2 = this.f9348d;
            if (eVar2 != null) {
                g e10 = eVar2.e("edit_msg_in", 10000L, map);
                e10.a("ok", new f(this, 12));
                e10.a("error", ge.a.f17294b);
                e10.a("timeout", ge.a.f17295c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
