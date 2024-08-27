package ue;

import android.content.Context;
import com.assetgro.stockgro.ui.social.domain.model.ChatMetaData;
import com.google.gson.Gson;
import java.io.File;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37071a;

    /* renamed from: b, reason: collision with root package name */
    public String f37072b;

    /* renamed from: c, reason: collision with root package name */
    public String f37073c;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37071a = context;
    }

    public final void a(Function1 chatMetaData) {
        ChatMetaData chatMetaData2;
        Intrinsics.checkNotNullParameter(chatMetaData, "chatMetaData");
        try {
            File file = new File(this.f37071a.getCacheDir(), "Stockgro");
            file.mkdirs();
            String x12 = dp.b.x1(new File(file, dp.b.k1(this.f37072b + this.f37073c) + ".data"));
            Gson gson = new Gson();
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object fromJson = gson.fromJson(x12, type);
            if (fromJson instanceof ChatMetaData) {
                chatMetaData2 = (ChatMetaData) fromJson;
            } else {
                chatMetaData2 = null;
            }
            if (chatMetaData2 != null) {
                chatMetaData.invoke(chatMetaData2);
            }
        } catch (Exception unused) {
        }
    }
}
