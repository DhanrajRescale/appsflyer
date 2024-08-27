package com.assetgro.stockgro.data.repository;

import au.e;
import au.i;
import com.assetgro.stockgro.data.model.StickersDto;
import com.assetgro.stockgro.data.remote.NetworkService;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nv.v0;
import org.jetbrains.annotations.NotNull;
import ut.n;

@e(c = "com.assetgro.stockgro.data.repository.ChatRepository$getStickerData$2", f = "ChatRepository.kt", l = {564}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lnv/v0;", "Lcom/assetgro/stockgro/data/remote/response/BaseResponseDto;", "Lcom/assetgro/stockgro/data/model/StickersDto;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChatRepository$getStickerData$2 extends i implements Function1<yt.a<? super v0<BaseResponseDto<StickersDto>>>, Object> {
    int label;
    final /* synthetic */ ChatRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepository$getStickerData$2(ChatRepository chatRepository, yt.a<? super ChatRepository$getStickerData$2> aVar) {
        super(1, aVar);
        this.this$0 = chatRepository;
    }

    @Override // au.a
    @NotNull
    public final yt.a<Unit> create(@NotNull yt.a<?> aVar) {
        return new ChatRepository$getStickerData$2(this.this$0, aVar);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        NetworkService networkService;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            networkService = this.this$0.networkService;
            this.label = 1;
            obj = networkService.getStickers(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(yt.a<? super v0<BaseResponseDto<StickersDto>>> aVar) {
        return ((ChatRepository$getStickerData$2) create(aVar)).invokeSuspend(Unit.f23355a);
    }
}
