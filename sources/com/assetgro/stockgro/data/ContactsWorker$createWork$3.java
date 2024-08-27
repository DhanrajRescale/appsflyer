package com.assetgro.stockgro.data;

import androidx.work.q;
import androidx.work.s;
import androidx.work.t;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import iu.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", HttpUrl.FRAGMENT_ENCODE_SET, "response", "Landroidx/work/t;", "kotlin.jvm.PlatformType", "invoke", "(Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;)Landroidx/work/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ContactsWorker$createWork$3 extends k implements Function1<BaseResponseDto<Object>, t> {
    public static final ContactsWorker$createWork$3 INSTANCE = new ContactsWorker$createWork$3();

    public ContactsWorker$createWork$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final t invoke(@NotNull BaseResponseDto<Object> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getSuccess()) {
            return new s(androidx.work.k.f2621c);
        }
        return new q(androidx.work.k.f2621c);
    }
}
