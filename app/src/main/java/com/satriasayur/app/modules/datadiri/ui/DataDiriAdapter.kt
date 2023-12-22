package com.satriasayur.app.modules.datadiri.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.satriasayur.app.R
import com.satriasayur.app.databinding.RowDataDiriBinding
import com.satriasayur.app.modules.datadiri.`data`.model.DataDiriRowModel
import kotlin.Int
import kotlin.collections.List

class DataDiriAdapter(
  var list: List<DataDiriRowModel>
) : RecyclerView.Adapter<DataDiriAdapter.RowDataDiriVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDataDiriVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_data_diri,parent,false)
    return RowDataDiriVH(view)
  }

  override fun onBindViewHolder(holder: RowDataDiriVH, position: Int) {
    val dataDiriRowModel = DataDiriRowModel()
    // TODO uncomment following line after integration with data source
    // val dataDiriRowModel = list[position]
    holder.binding.dataDiriRowModel = dataDiriRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DataDiriRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DataDiriRowModel
    ) {
    }
  }

  inner class RowDataDiriVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDataDiriBinding = RowDataDiriBinding.bind(itemView)
  }
}
