package ba;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.assetgro.stockgro.feature_social.data.remote.ria.RiaProfileResponseDto;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class gc extends fc {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4793u;

    /* renamed from: v, reason: collision with root package name */
    public long f4794v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(View view) {
        super(null, view, 0);
        Object[] j10 = m4.m.j(view, 2, null, null);
        this.f4794v = -1L;
        ((LinearLayout) j10[0]).setTag(null);
        TextView textView = (TextView) j10[1];
        this.f4793u = textView;
        textView.setTag(null);
        view.setTag(R.id.dataBinding, this);
        h();
    }

    @Override // m4.m
    public final void b() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.f4794v;
            this.f4794v = 0L;
        }
        RiaProfileResponseDto.ExpertMeta.Expertise expertise = this.f4700s;
        long j11 = j10 & 3;
        if (j11 != 0 && expertise != null) {
            str = expertise.getTitle();
        } else {
            str = null;
        }
        if (j11 != 0) {
            el.l.A0(this.f4793u, str);
        }
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4794v != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.f4794v = 2L;
        }
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        return false;
    }
}
