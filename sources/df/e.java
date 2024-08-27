package df;

import com.assetgro.stockgro.data.model.TutorialDto;
import iu.k;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f14326b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f14327c = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14328a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(1);
        this.f14328a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f14328a;
        switch (i10) {
            case 0:
                TutorialDto tutorialDto = (TutorialDto) obj;
                switch (i10) {
                    case 0:
                        return tutorialDto.getTitle();
                    default:
                        return tutorialDto.getVideoId();
                }
            default:
                TutorialDto tutorialDto2 = (TutorialDto) obj;
                switch (i10) {
                    case 0:
                        return tutorialDto2.getTitle();
                    default:
                        return tutorialDto2.getVideoId();
                }
        }
    }
}
