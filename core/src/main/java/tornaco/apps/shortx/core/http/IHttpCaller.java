/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package tornaco.apps.shortx.core.http;
public interface IHttpCaller extends android.os.IInterface
{
  /** Default implementation for IHttpCaller. */
  public static class Default implements tornaco.apps.shortx.core.http.IHttpCaller
  {
    @Override public void call(java.lang.String requestId, tornaco.apps.shortx.core.os.SynchronousResultReceiver receiver, java.lang.String url, java.lang.String method, java.util.Map<java.lang.String,java.lang.String> headers, tornaco.apps.shortx.core.rule.action.ByteArrayWrapper requestBodyData, boolean withCookieJar, boolean trustAllCerts) throws android.os.RemoteException
    {
    }
    @Override public void close(java.lang.String requestId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements tornaco.apps.shortx.core.http.IHttpCaller
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an tornaco.apps.shortx.core.http.IHttpCaller interface,
     * generating a proxy if needed.
     */
    public static tornaco.apps.shortx.core.http.IHttpCaller asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof tornaco.apps.shortx.core.http.IHttpCaller))) {
        return ((tornaco.apps.shortx.core.http.IHttpCaller)iin);
      }
      return new tornaco.apps.shortx.core.http.IHttpCaller.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_call:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          tornaco.apps.shortx.core.os.SynchronousResultReceiver _arg1;
          _arg1 = _Parcel.readTypedObject(data, tornaco.apps.shortx.core.os.SynchronousResultReceiver.CREATOR);
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          java.util.Map<java.lang.String,java.lang.String> _arg4;
          {
            int N = data.readInt();
            _arg4 = N < 0 ? null : new java.util.HashMap<>();
            java.util.stream.IntStream.range(0, N).forEach(i -> {
              String k = data.readString();
              java.lang.String v;
              v = data.readString();
              _arg4.put(k, v);
            });
          }
          tornaco.apps.shortx.core.rule.action.ByteArrayWrapper _arg5;
          _arg5 = _Parcel.readTypedObject(data, tornaco.apps.shortx.core.rule.action.ByteArrayWrapper.CREATOR);
          boolean _arg6;
          _arg6 = (0!=data.readInt());
          boolean _arg7;
          _arg7 = (0!=data.readInt());
          this.call(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
          break;
        }
        case TRANSACTION_close:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.close(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements tornaco.apps.shortx.core.http.IHttpCaller
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void call(java.lang.String requestId, tornaco.apps.shortx.core.os.SynchronousResultReceiver receiver, java.lang.String url, java.lang.String method, java.util.Map<java.lang.String,java.lang.String> headers, tornaco.apps.shortx.core.rule.action.ByteArrayWrapper requestBodyData, boolean withCookieJar, boolean trustAllCerts) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(requestId);
          _Parcel.writeTypedObject(_data, receiver, 0);
          _data.writeString(url);
          _data.writeString(method);
          if (headers == null) {
            _data.writeInt(-1);
          } else {
            _data.writeInt(headers.size());
            headers.forEach((k, v) -> {
              _data.writeString(k);
              _data.writeString(v);
            });
          }
          _Parcel.writeTypedObject(_data, requestBodyData, 0);
          _data.writeInt(((withCookieJar)?(1):(0)));
          _data.writeInt(((trustAllCerts)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_call, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void close(java.lang.String requestId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(requestId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_close, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_call = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "tornaco.apps.shortx.core.http.IHttpCaller";
  public void call(java.lang.String requestId, tornaco.apps.shortx.core.os.SynchronousResultReceiver receiver, java.lang.String url, java.lang.String method, java.util.Map<java.lang.String,java.lang.String> headers, tornaco.apps.shortx.core.rule.action.ByteArrayWrapper requestBodyData, boolean withCookieJar, boolean trustAllCerts) throws android.os.RemoteException;
  public void close(java.lang.String requestId) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
