package rd;

import com.assetgro.stockgro.data.model.Desi;
import com.assetgro.stockgro.data.model.Stickers;
import com.assetgro.stockgro.data.model.StickersDto;
import com.assetgro.stockgro.data.remote.NetworkResult;
import com.assetgro.stockgro.data.remote.SGError;
import com.assetgro.stockgro.data.remote.response.BaseResponseDto;
import com.assetgro.stockgro.data.repository.ChatRepository;
import com.assetgro.stockgro.data.uimodel.StickerData;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f33662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GroupChatViewModel f33663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(GroupChatViewModel groupChatViewModel, yt.a aVar) {
        super(2, aVar);
        this.f33663b = groupChatViewModel;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f33663b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        StickersDto stickersDto;
        StickersDto stickersDto2;
        Stickers stickers;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f33662a;
        GroupChatViewModel groupChatViewModel = this.f33663b;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ut.n.b(obj);
                ChatRepository chatRepository = groupChatViewModel.f9176n;
                this.f33662a = 1;
                obj = chatRepository.getStickerData(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            NetworkResult networkResult = (NetworkResult) obj;
            String str = null;
            r1 = null;
            r1 = null;
            List<Desi> list = null;
            if (networkResult instanceof NetworkResult.Success) {
                BaseResponseDto baseResponseDto = (BaseResponseDto) networkResult.getData();
                if (baseResponseDto != null) {
                    stickersDto = (StickersDto) baseResponseDto.getData();
                } else {
                    stickersDto = null;
                }
                groupChatViewModel.f9197y = stickersDto;
                ArrayList arrayList = new ArrayList();
                BaseResponseDto baseResponseDto2 = (BaseResponseDto) networkResult.getData();
                if (baseResponseDto2 != null && (stickersDto2 = (StickersDto) baseResponseDto2.getData()) != null && (stickers = stickersDto2.getStickers()) != null) {
                    list = stickers.getDesi();
                }
                if (list != null) {
                    for (Desi desi : list) {
                        arrayList.add(new StickerData(groupChatViewModel.f9195x, desi.getUrl(), desi.getStickerId()));
                    }
                }
                groupChatViewModel.f9174l0.postValue(arrayList);
            } else if (networkResult instanceof NetworkResult.Error) {
                SGError error = networkResult.getError();
                if (error != null) {
                    str = error.getErrorText();
                }
                groupChatViewModel.f(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.f23355a;
    }
}
