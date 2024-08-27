package f9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.options.OptionsListHostActivity;
import i9.c;
import iu.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import w8.b;

/* loaded from: classes.dex */
public final class a extends k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f15988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Context context, int i10) {
        super(0);
        this.f15987a = i10;
        this.f15988b = context;
    }

    public final void a() {
        int i10 = this.f15987a;
        Activity activity = null;
        Context context = this.f15988b;
        switch (i10) {
            case 2:
                if (context instanceof Activity) {
                    activity = (Activity) context;
                }
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            case 3:
                if (context instanceof Activity) {
                    activity = (Activity) context;
                }
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            case 4:
                context.startActivity(new Intent(context, (Class<?>) OptionsListHostActivity.class));
                return;
            default:
                context.startActivity(new Intent(context, (Class<?>) OptionsListHostActivity.class));
                return;
        }
    }

    public final int invoke() {
        Integer valueOf = Integer.valueOf(R.attr.colorPrimary);
        Context context = this.f15988b;
        switch (this.f15987a) {
            case 0:
                return c.b(context, null, valueOf, null, 10);
            default:
                int b10 = c.b(context, null, valueOf, null, 10);
                return Color.argb((int) (255 * 0.12f), Color.red(b10), Color.green(b10), Color.blue(b10));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f15987a) {
            case 0:
                return Integer.valueOf(invoke());
            case 1:
                return Integer.valueOf(invoke());
            case 2:
                a();
                return Unit.f23355a;
            case 3:
                a();
                return Unit.f23355a;
            case 4:
                a();
                return Unit.f23355a;
            case 5:
                a();
                return Unit.f23355a;
            default:
                b bVar = new b(this.f15988b);
                bVar.b(0.25d);
                return bVar.a();
        }
    }
}
