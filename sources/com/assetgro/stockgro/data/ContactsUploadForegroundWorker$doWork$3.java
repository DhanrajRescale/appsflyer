package com.assetgro.stockgro.data;

import androidx.work.j;
import androidx.work.q;
import com.assetgro.stockgro.data.repository.ApiExceptionUtilitiesKt;
import iu.k;
import iu.z;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "ex", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContactsUploadForegroundWorker$doWork$3 extends k implements Function1<Throwable, Unit> {
    final /* synthetic */ z $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactsUploadForegroundWorker$doWork$3(z zVar) {
        super(1);
        this.$result = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.f23355a;
    }

    public final void invoke(Throwable th2) {
        th2.printStackTrace();
        String extractMessage = ApiExceptionUtilitiesKt.extractMessage(th2);
        z zVar = this.$result;
        Pair[] pairArr = {new Pair("message", extractMessage)};
        j jVar = new j(0);
        Pair pair = pairArr[0];
        jVar.b(pair.f23354b, (String) pair.f23353a);
        androidx.work.k a10 = jVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "dataBuilder.build()");
        zVar.f20560a = new q(a10);
    }
}
