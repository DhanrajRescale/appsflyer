package ni;

import ak.d0;
import android.app.Activity;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.navigation.c0;
import androidx.navigation.f0;
import androidx.navigation.u0;
import androidx.navigation.w0;
import com.assetgro.stockgro.data.model.ModifyOrderDto;
import ek.w;
import ek.x;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public class j implements sk.a, dk.b, x, o5.j, t5.d, z5.f, p7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28738a;

    public static MediaCodec c(o5.i iVar) {
        iVar.f29625a.getClass();
        String str = iVar.f29625a.f29630a;
        e5.a.a("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        e5.a.i();
        return createByCodecName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Activity activity, androidx.lifecycle.m event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (activity instanceof t) {
            androidx.lifecycle.o lifecycle = ((t) activity).getLifecycle();
            if (lifecycle instanceof v) {
                ((v) lifecycle).f(event);
            }
        }
    }

    public static kj.h i(Object obj) {
        return new kj.h(kj.k.f23230b, obj);
    }

    public static c0 k(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Sequence d10 = pu.m.d(androidx.navigation.c.f2168j, f0Var.o(f0Var.f2192l, true));
        Intrinsics.checkNotNullParameter(d10, "<this>");
        Iterator it = d10.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (c0) next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static qi.c m(Bundle bundle) {
        if (da.e.y(bundle, "bundle", qi.c.class, "stock")) {
            if (!Parcelable.class.isAssignableFrom(ModifyOrderDto.class) && !Serializable.class.isAssignableFrom(ModifyOrderDto.class)) {
                throw new UnsupportedOperationException(ModifyOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            ModifyOrderDto modifyOrderDto = (ModifyOrderDto) bundle.get("stock");
            if (modifyOrderDto != null) {
                return new qi.c(modifyOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stock\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stock\" is missing and does not have an android:defaultValue");
    }

    public static String n(Class navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = w0.f2336b;
        String str = (String) linkedHashMap.get(navigatorClass);
        if (str == null) {
            u0 u0Var = (u0) navigatorClass.getAnnotation(u0.class);
            if (u0Var != null) {
                str = u0Var.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(navigatorClass, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
        }
        Intrinsics.c(str);
        return str;
    }

    public static kj.h r(Integer num) {
        return new kj.h(kj.k.f23229a, num);
    }

    @Override // o5.j
    public o5.k a(o5.i iVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = c(iVar);
            e5.a.a("configureCodec");
            mediaCodec.configure(iVar.f29626b, iVar.f29628d, iVar.f29629e, 0);
            e5.a.i();
            e5.a.a("startCodec");
            mediaCodec.start();
            e5.a.i();
            return new o5.v(mediaCodec);
        } catch (IOException | RuntimeException e10) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e10;
        }
    }

    public m4.n b(m4.m mVar, int i10, ReferenceQueue referenceQueue) {
        switch (this.f28738a) {
            case 4:
                return new m4.l(mVar, i10, referenceQueue).f27482a;
            default:
                return new m4.j(mVar, i10, referenceQueue).f27479a;
        }
    }

    public s6.c d(b5.v vVar) {
        String str = vVar.f3652l;
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        c10 = '\b';
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        c10 = '\t';
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c10 = '\n';
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c10 = 11;
                        break;
                    }
                    break;
            }
            int i10 = vVar.D;
            List list = vVar.f3654n;
            switch (c10) {
                case 0:
                    return new u6.a(list);
                case 1:
                    return new v6.b();
                case 2:
                    return new u6.a();
                case 3:
                    return new a7.i();
                case 4:
                    return new z6.a(list);
                case 5:
                    return new w6.a(list);
                case 6:
                case '\b':
                    return new t6.c(str, i10);
                case 7:
                    return new t5.c();
                case '\t':
                    return new t6.f(i10, list);
                case '\n':
                    return new x6.a();
                case 11:
                    return new y6.d();
            }
        }
        throw new IllegalArgumentException(a3.a.f("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // z5.f
    public long e(long j10) {
        return j10;
    }

    @Override // ek.x
    public w f(ek.c0 c0Var) {
        return new ek.f(new hr.c(this, 26), 0);
    }

    @Override // p7.c
    public p7.d g(p7.b bVar) {
        return new q7.e(bVar.f30720a, bVar.f30721b, bVar.f30722c, bVar.f30723d);
    }

    @Override // sk.a
    public Object j() {
        return new d0();
    }

    @Override // dk.b
    public void l(Throwable th2) {
    }

    public boolean o() {
        return false;
    }

    public void p(boolean z10) {
    }

    public void q(boolean z10) {
    }

    public boolean s(b5.v vVar) {
        String str = vVar.f3652l;
        if (!"text/vtt".equals(str) && !"text/x-ssa".equals(str) && !"application/ttml+xml".equals(str) && !"application/x-mp4-vtt".equals(str) && !"application/x-subrip".equals(str) && !"application/x-quicktime-tx3g".equals(str) && !"application/cea-608".equals(str) && !"application/x-mp4-cea-608".equals(str) && !"application/cea-708".equals(str) && !"application/dvbsubs".equals(str) && !"application/pgs".equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ j(int i10) {
        this.f28738a = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i10, int i11) {
        this(0);
        this.f28738a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            default:
                return;
        }
    }
}
